package ai.reaver;

import java.io.Serializable;

/**
* Created with IntelliJ IDEA Ultimate.
* User: http://www.ilikeplaces.com
* Date: 24/12/12
* Time: 10:20 PM
*/
class ReturnLoggerClientImpl implements LoggerClient, Serializable {
    @Override
    public void log(final String message, final Object objectOfWhichToStringWillBeCalledButPermitsNull) {
        if (ReturnImpl.LOGGING_APPROACH != null) {
            ReturnImpl.LOGGING_APPROACH.log(message, objectOfWhichToStringWillBeCalledButPermitsNull);
        } else {
            System.out.println(message + ":" + objectOfWhichToStringWillBeCalledButPermitsNull);
        }
    }
}
