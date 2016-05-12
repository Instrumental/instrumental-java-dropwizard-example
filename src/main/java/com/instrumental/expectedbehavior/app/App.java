package com.instrumental_java_client_test.expectedbehavior.app;
import com.instrumentalapp.*;
import java.util.concurrent.TimeUnit;

/**
 * Simple test of the Instrumental Java library
 * See the example metrics in Instrumental by making a graph with the query "instrumental.java.*"
 */
public class App
{
    public static void main( String[] args ) throws InterruptedException, java.io.IOException
    {
      // Send metrics directly to Instrumental
      // Instrumental instrumental = new Instrumental("29a13a93a7ef53fe3e13976e3b20cdb6");
      Agent instrumental = new Agent(new AgentOptions().setApiKey("29a13a93a7ef53fe3e13976e3b20cdb6").setEnabled(true));
      instrumental.notice("Important Event");
      for (int i = 0; i < 10; i++) {
        instrumental.increment("instrumental.java.direct.test_metric");
        Thread.sleep(1000);
        System.out.println("sleep and pretend things are happening in a complex app");
      }



      // // Using a Dropwizard registry
      // MetricRegistry registry = new MetricRegistry(); // or use an existing registry
      //
      // InstrumentalReporter instrumentalReporter = InstrumentalReporter.forRegistry(registry)
      // .convertRatesTo(TimeUnit.SECONDS)
      // .convertDurationsTo(TimeUnit.MILLISECONDS)
      // .build(instrumental);
      // instrumentalReporter.start(1, TimeUnit.SECONDS);
      //
      // for (int i = 0; i < 10; i++) {
      //   registry.counter("instrumental.java.registry.test_metric").inc();
      //   Thread.sleep(1000);
      //   System.out.println("sleep and pretend things are happening in a complex app");
      // }

      Thread.sleep(30000); // wait for registry to flush

      System.out.println( "Finished!" );
    }
}
