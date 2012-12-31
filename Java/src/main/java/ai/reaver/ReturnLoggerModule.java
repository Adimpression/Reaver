package ai.reaver;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryProvider;

/**
* Created with IntelliJ IDEA Ultimate.
* User: http://www.ilikeplaces.com
* Date: 24/12/12
* Time: 10:20 PM
*/
class ReturnLoggerModule extends AbstractModule {

    @Override
    protected void configure() {

        bind(LoggerClientFactory.class).toProvider(
                FactoryProvider.newFactory(
                        LoggerClientFactory.class,
                        ReturnLoggerClientImpl.class));
    }

}
