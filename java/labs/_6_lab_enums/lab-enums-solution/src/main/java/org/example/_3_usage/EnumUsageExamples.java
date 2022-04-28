package org.example._3_usage;

import org.example._2_basic.LogLevel;

public class EnumUsageExamples {

    String getLogLevelMessageUsingSwitchCase(LogLevel logLevel) {
        switch (logLevel){
            case DEBUG -> {
                return "It's DEBUG!";
            }
            case INFO -> {
                return "It's INFO!";
            }
            default -> {
                return "It's WARNING!";
            }
        }
    }

    String getLogLevelMessageUsingIf(LogLevel logLevel) {
        // We can use == in an if statement for enums! (google why ;) )
        if(logLevel == LogLevel.DEBUG) {
            return "It's DEBUG!";

        } else if (logLevel == LogLevel.INFO) {
            return "It's INFO!";

        } else if (logLevel == LogLevel.WARNING) {
            return "It's WARNING!";

        } else {
            throw new RuntimeException("This enum value is not supported yet!");
        }

    }
}
