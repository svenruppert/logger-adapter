package org.rapidpm.dependencies.core.logger;

import org.rapidpm.dependencies.core.logger.factory.StandardLoggerFactory;

public interface HasLogger {
  public default LoggingService logger(){
    return Logger.getLogger(getClass());
  }

}
