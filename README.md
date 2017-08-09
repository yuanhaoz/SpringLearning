# SpringLearning
## Spring入门学习
学习immooc上spring教程时自己敲了一遍视频中的代码，加深印象和理解。
视频链接：http://www.imooc.com/learn/196

## 涉及概念
1. spring ioc及注入方式(构造器注入construcor和设值注入set)
2. spring bean的配置项、作用域、生命周期、自动装配、Resources&ResourceLoader、bean的注解方式
例如：@Component(大类)/@Service(服务层)/@Controller(控制层)/@Repository(模型层)/@autowired/@Scope(作用域) 等等
3. spring aop的概念（Aspect Oriented Programming）、切入点、切面等。

## Note
1. AOP的主要功能：日志记录、性能统计、安全控制、事务处理、异常处理等等。
2. AOP的实现方式：(1) 预编译（AspectJ）(2) 运行期动态代理（JDK动态代理、CGLib动态代理）（SpringAOP, JbossAOP）
3. AOP相关概念：
   （1）切面（Aspect）：一个关注点的模块化，这个关注点可能会横切多个对象
   （2）连接点（Joinpoint）：程序执行过程中某个特定的点
   （3）通知（Advice）：在切面的某个特定的连接点上执行的动作
        （3.1）前置通知（Before advice）：在某个连接点执行之前的通知，但不阻止连接点之前的执行
        （3.2）返回后通知（After returning advice）：在某个连接点正常执行结束后的通知
        （3.3）抛出异常后通知（After throwing advice）：在方法抛出异常退出时执行的通知
        （3.4）后通知（After (finally) advice）：当某个连接点退出的时候执行的通知
        （3.4）环绕通知（Around advice）：包围一个连接点的通知
   （4）切入点（Pointcut）：匹配连接点的断言，在AOP中通知和一个切入点表达式相关
   （5）引入（Introduction）：在不修改类代码的前提下，为类添加新的方法和属性
   （6）目标对象（Target）：被一个或者多个切面所通知的对象
   （7）AOP代理（AOP Proxy）：AOP框架创建的对象，用来实现切面契约（包括通知方法执行等）
   （7）织入（Weaving）：把切面连接到其它应用程序类型或者对象上，并创建一个被通知单额对象，
        分别为：编译时织入、类加载时织入、执行时织入
