package re.session07_bai04.Aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceExceptionAspect {
    private static final Logger logger = LoggerFactory.getLogger(ServiceExceptionAspect.class);

    @AfterThrowing(pointcut = "execution(* re.session07_bai04.Service..*(..))", throwing = "ex")
    public void logServiceException(Exception ex) {

        logger.error("Service Exception: {}", ex.getMessage(), ex);
    }
}
