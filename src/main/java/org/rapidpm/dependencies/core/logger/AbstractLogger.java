/**
 * Copyright © 2017 Sven Ruppert (sven.ruppert@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rapidpm.dependencies.core.logger;

import java.util.function.Supplier;
import java.util.logging.Level;
import org.rapidpm.dependencies.core.logger.tp.org.slf4j.helpers.FormattingTuple;
import org.rapidpm.dependencies.core.logger.tp.org.slf4j.helpers.MessageFormatter;


/**
 * <p>Abstract AbstractLogger class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
public abstract class AbstractLogger implements LoggingService {

    /** {@inheritDoc} */
    @Override
    public void finest(String message) {
        log(Level.FINEST, message);
    }

    /** {@inheritDoc} */
    @Override
    public void finest(String message, Throwable thrown) {
        log(Level.FINEST, message, thrown);
    }

    /** {@inheritDoc} */
    @Override
    public void finest(Throwable thrown) {
        log(Level.FINEST, thrown.getMessage(), thrown);
    }
    
    @Override
    public void finest(Supplier<String> message) {
      if(isFinestEnabled()) {
        finest(message.get());
      }
    }
    
    @Override
    public void finest(Supplier<String> message, Throwable thrown) {
      if(isFinestEnabled()) {
        finest(message.get(), thrown);
      }
    }
    
    @Override
    public void finest(String format, Object arg0) {
      finest(format, arg0, null);
    }
    
    @Override
    public void finest(String format, Object arg1, Object arg2) {
      if (!isFinestEnabled()) {
        return;
      }
      FormattingTuple tp = MessageFormatter.format(format, arg1, arg2);
      finest(tp.getMessage(), tp.getThrowable());
    }
      
      @Override
      public void finest(String format, Object... arguments) {
        if (!isFinestEnabled()) {
          return;
        }
      FormattingTuple tp = MessageFormatter.arrayFormat(format, arguments);
      finest(tp.getMessage(), tp.getThrowable());
      }

    /** {@inheritDoc} */
    @Override
    public void fine(String message) {
        log(Level.FINE, message);
    }

    /** {@inheritDoc} */
    @Override
    public boolean isFinestEnabled() {
        return isLoggable(Level.FINEST);
    }

    /** {@inheritDoc} */
    @Override
    public boolean isFineEnabled() {
        return isLoggable(Level.FINE);
    }

    /** {@inheritDoc} */
    @Override
    public void info(String message) {
        log(Level.INFO, message);
    }

    @Override
    public void info(String message, Throwable thrown) {
      log(Level.INFO, message, thrown);
    }

    @Override
    public void info(Supplier<String> message) {
      if(isLoggable(Level.INFO)) {
        info(message.get());
      }
    }
    
    @Override
    public void info(Supplier<String> message, Throwable thrown) {
      if(isLoggable(Level.INFO)) {
        info(message.get(), thrown);
      }
    }
    
    @Override
    public void info(String format, Object arg0) {
      info(format, arg0, null);
    }

    @Override
    public void info(String format, Object arg1, Object arg2) {
      if (!isLoggable(Level.INFO)) {
        return;
      }
      FormattingTuple tp = MessageFormatter.format(format, arg1, arg2);
      info(tp.getMessage(), tp.getThrowable());
    }

    @Override
    public void info(String format, Object... arguments) {
      if (!isLoggable(Level.INFO)) {
        return;
      }
      FormattingTuple tp = MessageFormatter.arrayFormat(format, arguments);
      info(tp.getMessage(), tp.getThrowable());
    }

    /** {@inheritDoc} */
    @Override
    public void severe(String message) {
        log(Level.SEVERE, message);
    }

    /** {@inheritDoc} */
    @Override
    public void severe(Throwable thrown) {
        log(Level.SEVERE, thrown.getMessage(), thrown);
    }

    /** {@inheritDoc} */
    @Override
    public void severe(String message, Throwable thrown) {
        log(Level.SEVERE, message, thrown);
    }

    @Override
    public void severe(Supplier<String> message) {
      if(isLoggable(Level.SEVERE)) {
        severe(message.get());
      }
    }
    
    @Override
    public void severe(Supplier<String> message, Throwable thrown) {
      if(isLoggable(Level.SEVERE)) {
        severe(message.get(), thrown);
      }
    }
    
    @Override
    public void severe(String format, Object arg0) {
      severe(format, arg0, null);
    }
    
    @Override
    public void severe(String format, Object arg1, Object arg2) {
      if (!isLoggable(Level.SEVERE)) {
        return;
      }
      FormattingTuple tp = MessageFormatter.format(format, arg1, arg2);
      severe(tp.getMessage(), tp.getThrowable());
    }
      
    @Override
    public void severe(String format, Object... arguments) {
      if (!isLoggable(Level.SEVERE)) {
        return;
      }
      FormattingTuple tp = MessageFormatter.arrayFormat(format, arguments);
      severe(tp.getMessage(), tp.getThrowable());
    }

    /** {@inheritDoc} */
    @Override
    public void warning(String message) {
        log(Level.WARNING, message);
    }

    /** {@inheritDoc} */
    @Override
    public void warning(Throwable thrown) {
        log(Level.WARNING, thrown.getMessage(), thrown);
    }

    /** {@inheritDoc} */
    @Override
    public void warning(String message, Throwable thrown) {
        log(Level.WARNING, message, thrown);
    }
    
    @Override
    public void warning(String format, Object arg0) {
      warning(format, arg0, null);
    }
    
    @Override
    public void warning(Supplier<String> message) {
      if(isLoggable(Level.WARNING)) {
        warning(message.get());
      }
    }
    
    @Override
    public void warning(Supplier<String> message, Throwable thrown) {
      if(isLoggable(Level.WARNING)) {
        warning(message.get(), thrown);
      }
    }
    
    @Override
    public void warning(String format, Object arg1, Object arg2) {
      if (!isLoggable(Level.WARNING)) {
        return;
      }
      FormattingTuple tp = MessageFormatter.format(format, arg1, arg2);
      warning(tp.getMessage(), tp.getThrowable());
    }
      
    @Override
    public void warning(String format, Object... arguments) {
      if (!isLoggable(Level.WARNING)) {
        return;
      }
      FormattingTuple tp = MessageFormatter.arrayFormat(format, arguments);
      warning(tp.getMessage(), tp.getThrowable());
    }
}
