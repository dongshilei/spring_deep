接口BeanPostProcessor有两个方法postProcessAfterInitialization和postProcessBeforeInitialization
postProcessBeforeInitialization 在bean初始化之前执行
postProcessAfterInitialization  在bean初始化之后执行

扩展思路：
Hyperspace中使用BeanPostProcessor的自定义实现类HyperspaceBeanPostProcessor
作用： 在Dao层实现类初始化之后，检测是否含有自定义的HyperspaceDao注解
如果有，则生成该Dao实现类的代理类
代码
public class HyperspaceBeanPostProcessor implements BeanPostProcessor {
	private HyperspaceProxy hyProxy = new HyperspaceProxy();
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		HyperspaceDao dao = bean.getClass().getAnnotation(HyperspaceDao.class);
		if (null != dao) {
			Object newBean = null;
			if (dao.type() == HyperspaceType.jdbc) {
				System.out.println("=======================jdbc: " + beanName);
				newBean = hyProxy.createJdbcProxy(bean.getClass());
			}
			if (dao.type() == HyperspaceType.cache) {
				System.out.println("======================cache: " + beanName);
				newBean = hyProxy.createCacheProxy(bean.getClass());
			}
			if (null != newBean) {
				try {
					hyProxy.copy(newBean, bean);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return newBean;
			} else {
				return bean;
			}
		}
		return bean;
	}
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		return bean;
	}
}