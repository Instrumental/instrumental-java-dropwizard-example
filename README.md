## Example project for the Instrumental reporter for Dropwizard
This is a simple example application using the [Instrumental reporter for Dropwizard](https://github.com/egineering-llc/metrics-instrumental).

After checking out this repo:

1) Change the API key to your Instrumental project key

2) Build with `mvn install`

3) Run
```
mvn exec:java -Dexec.mainClass="com.instrumental_java_client_test.expectedbehavior.app.App"
```

Remember to re-run the maven command if you edit the project.

## See the metrics in Instrumental
The example sends metric directly to Instrumental and also through a registry. You can view all metrics sent to Instrumental from this example by making a graph with the query `instrumental.java.*`

## More Help?
If you need more help or examples, contact [support@instrumentalapp.com](support@instrumentalapp.com).
