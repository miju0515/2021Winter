package hello.hellospring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TimeTraceAop {

    @Around("execution(* hello.hellospring..*(..))")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable{
        long start = System.currentTimeMillis();
        try {
            //인라인화 ctrl+alt+n
            return joinPoint.proceed();
        }finally {
            long finish= System.currentTimeMillis();
            long timeMs=finish-start;
            System.out.println("ENE: "+joinPoint.toString()+" "+timeMs+"ms");
        }
    }
}
