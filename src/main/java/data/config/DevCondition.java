package data.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DevCondition implements Condition {
    public boolean matches(
            ConditionContext context,
            AnnotatedTypeMetadata metadata) {
        String env = context.getEnvironment().getProperty("env");
        return "dev".equals(env);
    }
}
