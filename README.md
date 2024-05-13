This repo demostrate the use of Spring Cloud Contract.  

To verify api-provider with the contract

```
cd api-provider 
mvn clean install
```

Will see output like this :
```
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.example.apiprovider.ContractVerifierTest
22:50:38.994 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.example.apiprovider.ContractVerifierTest]: ContractVerifierTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
22:50:39.053 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.example.apiprovider.ApiProviderApplication for test class com.example.apiprovider.ContractVerifierTest

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.5)

2024-05-13T22:50:39.216+07:00  INFO 30608 --- [api-provider] [           main] c.e.apiprovider.ContractVerifierTest     : Starting ContractVerifierTest using Java 17.0.7 with PID 30608 (started by wongderrick in /Users/wongderrick/workspaces/ioh-tap/api-provider)
2024-05-13T22:50:39.217+07:00  INFO 30608 --- [api-provider] [           main] c.e.apiprovider.ContractVerifierTest     : No active profile set, falling back to 1 default profile: "default"
2024-05-13T22:50:40.400+07:00  INFO 30608 --- [api-provider] [           main] o.s.c.c.v.m.i.ContractVerifierMessaging  : The message verifier sender implementation is of type [class org.springframework.cloud.contract.verifier.messaging.noop.NoOpStubMessages]
2024-05-13T22:50:40.400+07:00  INFO 30608 --- [api-provider] [           main] o.s.c.c.v.m.i.ContractVerifierMessaging  : The message verifier receiver implementation is of type [class org.springframework.cloud.contract.verifier.messaging.noop.NoOpStubMessages]
2024-05-13T22:50:40.419+07:00  INFO 30608 --- [api-provider] [           main] c.e.apiprovider.ContractVerifierTest     : Started ContractVerifierTest in 1.308 seconds (process running for 1.767)
2024-05-13T22:50:41.146+07:00  INFO 30608 --- [api-provider] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2024-05-13T22:50:41.146+07:00  INFO 30608 --- [api-provider] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2024-05-13T22:50:41.147+07:00  INFO 30608 --- [api-provider] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 0 ms
2024-05-13T22:50:41.350+07:00  INFO 30608 --- [api-provider] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2024-05-13T22:50:41.350+07:00  INFO 30608 --- [api-provider] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2024-05-13T22:50:41.350+07:00  INFO 30608 --- [api-provider] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 0 ms
2024-05-13T22:50:41.357+07:00  INFO 30608 --- [api-provider] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2024-05-13T22:50:41.357+07:00  INFO 30608 --- [api-provider] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2024-05-13T22:50:41.357+07:00  INFO 30608 --- [api-provider] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 0 ms
2024-05-13T22:50:41.361+07:00  INFO 30608 --- [api-provider] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2024-05-13T22:50:41.361+07:00  INFO 30608 --- [api-provider] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2024-05-13T22:50:41.361+07:00  INFO 30608 --- [api-provider] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 0 ms
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.453 s -- in com.example.apiprovider.ContractVerifierTest
```

To verify api-consumer with the contract

```
cd api-consumer
mvn test 
```

Will see output like this:
```
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.example.apiconsumer.HelperTest
22:51:57.876 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.example.apiconsumer.HelperTest]: HelperTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
22:51:57.927 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.example.apiconsumer.ApiConsumerApplication for test class com.example.apiconsumer.HelperTest

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.5)

2024-05-13T22:51:58.086+07:00  INFO 31829 --- [api-consumer] [           main] com.example.apiconsumer.HelperTest       : Starting HelperTest using Java 17.0.7 with PID 31829 (started by wongderrick in /Users/wongderrick/workspaces/ioh-tap/api-consumer)
2024-05-13T22:51:58.087+07:00  INFO 31829 --- [api-consumer] [           main] com.example.apiconsumer.HelperTest       : No active profile set, falling back to 1 default profile: "default"
2024-05-13T22:51:58.393+07:00  WARN 31829 --- [api-consumer] [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.contract.stubrunner.spring.StubRunnerConfiguration' of type [org.springframework.cloud.contract.stubrunner.spring.StubRunnerConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). The currently created BeanPostProcessor [batchStubRunnerBeanPostProcessor] is declared through a non-static factory method on that class; consider declaring it as static instead.
2024-05-13T22:51:58.401+07:00  WARN 31829 --- [api-consumer] [           main] trationDelegate$BeanPostProcessorChecker : Bean 'stubrunner-org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties' of type [org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [batchStubRunnerBeanPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
2024-05-13T22:51:58.403+07:00  INFO 31829 --- [api-consumer] [           main] o.s.c.c.s.AetherStubDownloaderBuilder    : Will download stubs and contracts via Aether
2024-05-13T22:51:58.414+07:00  INFO 31829 --- [api-consumer] [           main] o.s.c.c.stubrunner.AetherStubDownloader  : Remote repos not passed but the switch to work offline was set. Stubs will be used from your local Maven repository.
2024-05-13T22:51:58.465+07:00  INFO 31829 --- [api-consumer] [           main] o.s.c.c.stubrunner.AetherStubDownloader  : Desired version is [+] - will try to resolve the latest version
2024-05-13T22:51:58.472+07:00  INFO 31829 --- [api-consumer] [           main] o.s.c.c.stubrunner.AetherStubDownloader  : Resolved version is [0.0.1-SNAPSHOT]
2024-05-13T22:51:58.477+07:00  INFO 31829 --- [api-consumer] [           main] o.s.c.c.stubrunner.AetherStubDownloader  : Resolved artifact [com.example:api-provider:jar:stubs:0.0.1-SNAPSHOT] to /Users/wongderrick/.m2/repository/com/example/api-provider/0.0.1-SNAPSHOT/api-provider-0.0.1-SNAPSHOT-stubs.jar
2024-05-13T22:51:58.478+07:00  INFO 31829 --- [api-consumer] [           main] o.s.c.c.stubrunner.AetherStubDownloader  : Unpacking stub from JAR [URI: file:/Users/wongderrick/.m2/repository/com/example/api-provider/0.0.1-SNAPSHOT/api-provider-0.0.1-SNAPSHOT-stubs.jar]
2024-05-13T22:51:58.483+07:00  INFO 31829 --- [api-consumer] [           main] o.s.c.c.stubrunner.AetherStubDownloader  : Unpacked file to [/var/folders/k9/25xtbl_n18b7m41km6jc6q6800twvg/T/contracts-1715615518477-0]
2024-05-13T22:51:59.332+07:00  INFO 31829 --- [api-consumer] [tp1633439396-33] WireMock                                 : Admin request received:
127.0.0.1 - POST /mappings

Host: []
Content-Length: [225]
Content-Type: [text/plain; charset=UTF-8]
Connection: [keep-alive]
User-Agent: [Apache-HttpClient/5.1.3 (Java/17.0.7)]
{
  "id" : "432e3dd9-5ff1-4f4b-a81c-06e5e9d65ac7",
  "request" : {
    "url" : "/ping",
    "method" : "GET"
  },
  "response" : {
    "status" : 200,
    "body" : "OK"
  },
  "uuid" : "432e3dd9-5ff1-4f4b-a81c-06e5e9d65ac7"
}

2024-05-13T22:51:59.342+07:00  INFO 31829 --- [api-consumer] [tp1633439396-26] WireMock                                 : Admin request received:
127.0.0.1 - POST /mappings

Host: []
Content-Length: [227]
Content-Type: [text/plain; charset=UTF-8]
Connection: [keep-alive]
User-Agent: [Apache-HttpClient/5.1.3 (Java/17.0.7)]
{
  "id" : "45b8a9c5-fca4-48b6-9805-131cf6e9c416",
  "request" : {
    "url" : "/health",
    "method" : "GET"
  },
  "response" : {
    "status" : 200,
    "body" : "OK"
  },
  "uuid" : "45b8a9c5-fca4-48b6-9805-131cf6e9c416"
}

2024-05-13T22:51:59.348+07:00  INFO 31829 --- [api-consumer] [tp1633439396-32] WireMock                                 : Admin request received:
127.0.0.1 - POST /mappings

Host: []
Content-Length: [465]
Content-Type: [text/plain; charset=UTF-8]
Connection: [keep-alive]
User-Agent: [Apache-HttpClient/5.1.3 (Java/17.0.7)]
{
  "id" : "67dc3920-5f0e-4415-be21-508d2c26be46",
  "request" : {
    "url" : "/contacts",
    "method" : "POST",
    "headers" : {
      "Content-Type" : {
        "matches" : "application/json.*"
      }
    },
    "bodyPatterns" : [ {
      "matchesJsonPath" : "$[?(@.['id'] == '1')]"
    } ]
  },
  "response" : {
    "status" : 400,
    "transformers" : [ "response-template", "spring-cloud-contract" ]
  },
  "uuid" : "67dc3920-5f0e-4415-be21-508d2c26be46"
}

2024-05-13T22:51:59.350+07:00  INFO 31829 --- [api-consumer] [tp1633439396-33] WireMock                                 : Admin request received:
127.0.0.1 - POST /mappings

Host: []
Content-Length: [475]
Content-Type: [text/plain; charset=UTF-8]
Connection: [keep-alive]
User-Agent: [Apache-HttpClient/5.1.3 (Java/17.0.7)]
{
  "id" : "33e169b0-a1df-4473-8ebd-c540c819441f",
  "request" : {
    "url" : "/contacts",
    "method" : "POST",
    "headers" : {
      "Content-Type" : {
        "matches" : "application/json.*"
      }
    },
    "bodyPatterns" : [ {
      "matchesJsonPath" : "$[?(@.['phone'] == '12345678')]"
    } ]
  },
  "response" : {
    "status" : 400,
    "transformers" : [ "response-template", "spring-cloud-contract" ]
  },
  "uuid" : "33e169b0-a1df-4473-8ebd-c540c819441f"
}

2024-05-13T22:51:59.353+07:00  INFO 31829 --- [api-consumer] [tp1633439396-32] WireMock                                 : Admin request received:
127.0.0.1 - POST /mappings

Host: []
Content-Length: [655]
Content-Type: [text/plain; charset=UTF-8]
Connection: [keep-alive]
User-Agent: [Apache-HttpClient/5.1.3 (Java/17.0.7)]
{
  "id" : "cf1e2a33-0fc7-48cc-868b-664ce1cc7147",
  "request" : {
    "url" : "/contacts",
    "method" : "POST",
    "headers" : {
      "Content-Type" : {
        "matches" : "application/json.*"
      }
    },
    "bodyPatterns" : [ {
      "matchesJsonPath" : "$[?(@.['id'] == '1')]"
    }, {
      "matchesJsonPath" : "$[?(@.['phone'] == '12345678')]"
    } ]
  },
  "response" : {
    "status" : 200,
    "body" : "{\"id\":\"1\",\"phone\":\"12345678\"}",
    "headers" : {
      "Content-Type" : "application/json"
    },
    "transformers" : [ "response-template", "spring-cloud-contract" ]
  },
  "uuid" : "cf1e2a33-0fc7-48cc-868b-664ce1cc7147"
}

2024-05-13T22:51:59.356+07:00  INFO 31829 --- [api-consumer] [tp1633439396-33] WireMock                                 : Admin request received:
127.0.0.1 - POST /mappings

Host: []
Content-Length: [533]
Content-Type: [text/plain; charset=UTF-8]
Connection: [keep-alive]
User-Agent: [Apache-HttpClient/5.1.3 (Java/17.0.7)]
{
  "id" : "9cf23403-a913-4c3f-92a4-16295adff02f",
  "request" : {
    "url" : "/contacts",
    "method" : "POST",
    "headers" : {
      "Content-Type" : {
        "matches" : "application/json.*"
      }
    },
    "bodyPatterns" : [ {
      "matchesJsonPath" : "$[?(@.['id'] == '1')]"
    }, {
      "matchesJsonPath" : "$[?(@.['phone'] == '1234567')]"
    } ]
  },
  "response" : {
    "status" : 400,
    "transformers" : [ "response-template", "spring-cloud-contract" ]
  },
  "uuid" : "9cf23403-a913-4c3f-92a4-16295adff02f"
}

2024-05-13T22:51:59.358+07:00  INFO 31829 --- [api-consumer] [           main] o.s.c.contract.stubrunner.StubServer     : Started stub server for project [com.example:api-provider:0.0.1-SNAPSHOT:stubs] on port 8080 with [4] mappings
2024-05-13T22:51:59.359+07:00  INFO 31829 --- [api-consumer] [           main] o.s.c.c.stubrunner.StubRunnerExecutor    : All stubs are now running RunningStubs [namesAndPorts={com.example:api-provider:0.0.1-SNAPSHOT:stubs=8080}]
2024-05-13T22:51:59.359+07:00  WARN 31829 --- [api-consumer] [           main] trationDelegate$BeanPostProcessorChecker : Bean 'batchStubRunner' of type [org.springframework.cloud.contract.stubrunner.BatchStubRunner] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [batchStubRunnerBeanPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
2024-05-13T22:51:59.417+07:00  INFO 31829 --- [api-consumer] [           main] o.s.c.c.v.m.i.ContractVerifierMessaging  : The message verifier sender implementation is of type [class org.springframework.cloud.contract.verifier.messaging.noop.NoOpStubMessages]
2024-05-13T22:51:59.417+07:00  INFO 31829 --- [api-consumer] [           main] o.s.c.c.v.m.i.ContractVerifierMessaging  : The message verifier receiver implementation is of type [class org.springframework.cloud.contract.verifier.messaging.noop.NoOpStubMessages]
2024-05-13T22:51:59.428+07:00  INFO 31829 --- [api-consumer] [           main] com.example.apiconsumer.HelperTest       : Started HelperTest in 1.445 seconds (process running for 1.931)
2024-05-13T22:51:59.429+07:00  INFO 31829 --- [api-consumer] [           main] c.e.apiconsumer.ApiConsumerApplication   : start
2024-05-13T22:51:59.429+07:00  INFO 31829 --- [api-consumer] [           main] c.e.apiconsumer.ApiConsumerApplication   : end
2024-05-13T22:51:59.973+07:00  INFO 31829 --- [api-consumer] [tp1633439396-31] WireMock                                 : Request received:
127.0.0.1 - POST /contacts

Connection: [Upgrade, HTTP2-Settings]
Content-Length: [10]
Host: [localhost:8080]
HTTP2-Settings: [AAEAAEAAAAIAAAABAAMAAABkAAQBAAAAAAUAAEAA]
Upgrade: [h2c]
User-Agent: [Java-http-client/17.0.7]
Content-Type: [application/json]
{"id":"1"}


Matched response definition:
{
  "status" : 400,
  "transformers" : [ "response-template", "spring-cloud-contract" ]
}

Response:
HTTP/1.1 400
Matched-Stub-Id: [67dc3920-5f0e-4415-be21-508d2c26be46]

2024-05-13T22:51:59.986+07:00  INFO 31829 --- [api-consumer] [tp1633439396-33] WireMock                                 : Request received:
127.0.0.1 - POST /contacts

Connection: [Upgrade, HTTP2-Settings]
Content-Length: [28]
Host: [localhost:8080]
HTTP2-Settings: [AAEAAEAAAAIAAAABAAMAAABkAAQBAAAAAAUAAEAA]
Upgrade: [h2c]
User-Agent: [Java-http-client/17.0.7]
Content-Type: [application/json]
{"phone":"1234567","id":"1"}


Matched response definition:
{
  "status" : 400,
  "transformers" : [ "response-template", "spring-cloud-contract" ]
}

Response:
HTTP/1.1 400
Matched-Stub-Id: [9cf23403-a913-4c3f-92a4-16295adff02f]

2024-05-13T22:51:59.991+07:00  INFO 31829 --- [api-consumer] [tp1633439396-32] WireMock                                 : Request received:
127.0.0.1 - POST /contacts

Connection: [Upgrade, HTTP2-Settings]
Content-Length: [20]
Host: [localhost:8080]
HTTP2-Settings: [AAEAAEAAAAIAAAABAAMAAABkAAQBAAAAAAUAAEAA]
Upgrade: [h2c]
User-Agent: [Java-http-client/17.0.7]
Content-Type: [application/json]
{"phone":"12345678"}


Matched response definition:
{
  "status" : 400,
  "transformers" : [ "response-template", "spring-cloud-contract" ]
}

Response:
HTTP/1.1 400
Matched-Stub-Id: [33e169b0-a1df-4473-8ebd-c540c819441f]

2024-05-13T22:52:00.026+07:00  INFO 31829 --- [api-consumer] [tp1633439396-31] WireMock                                 : Request received:
127.0.0.1 - POST /contacts

Connection: [Upgrade, HTTP2-Settings]
Content-Length: [29]
Host: [localhost:8080]
HTTP2-Settings: [AAEAAEAAAAIAAAABAAMAAABkAAQBAAAAAAUAAEAA]
Upgrade: [h2c]
User-Agent: [Java-http-client/17.0.7]
Content-Type: [application/json]
{"phone":"12345678","id":"1"}


Matched response definition:
{
  "status" : 200,
  "body" : "{\"id\":\"1\",\"phone\":\"12345678\"}",
  "headers" : {
    "Content-Type" : "application/json"
  },
  "transformers" : [ "response-template", "spring-cloud-contract" ]
}

Response:
HTTP/1.1 200
Content-Type: [application/json]
Matched-Stub-Id: [cf1e2a33-0fc7-48cc-868b-664ce1cc7147]

2024-05-13T22:52:00.029+07:00  WARN 31829 --- [api-consumer] [           main] .StubRunnerWireMockTestExecutionListener : You've used fixed ports for WireMock setup - will mark context as dirty. Please use random ports, as much as possible. Your tests will be faster and more reliable and this warning will go away
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.241 s -- in com.example.apiconsumer.HelperTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.882 s
[INFO] Finished at: 2024-05-13T22:52:00+07:00
[INFO] ------------------------------------------------------------------------
```