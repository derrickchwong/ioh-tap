This repo demostrate the use of Spring Cloud Contract.  

There is a sample contract at [here](./api-provider/src/test/resources/contracts/validate.groovy). Try modify it and run tests.

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
23:08:49.666 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.example.apiprovider.ContractVerifierTest]: ContractVerifierTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
23:08:49.728 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.example.apiprovider.ApiProviderApplication for test class com.example.apiprovider.ContractVerifierTest

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.5)

2024-05-13T23:08:49.919+07:00  INFO 47992 --- [api-provider] [           main] c.e.apiprovider.ContractVerifierTest     : Starting ContractVerifierTest using Java 17.0.7 with PID 47992 (started by wongderrick in /Users/wongderrick/workspaces/ioh-tap/api-provider)
2024-05-13T23:08:49.919+07:00  INFO 47992 --- [api-provider] [           main] c.e.apiprovider.ContractVerifierTest     : No active profile set, falling back to 1 default profile: "default"
2024-05-13T23:08:50.458+07:00  INFO 47992 --- [api-provider] [           main] o.s.c.c.v.m.i.ContractVerifierMessaging  : The message verifier sender implementation is of type [class org.springframework.cloud.contract.verifier.messaging.noop.NoOpStubMessages]
2024-05-13T23:08:50.459+07:00  INFO 47992 --- [api-provider] [           main] o.s.c.c.v.m.i.ContractVerifierMessaging  : The message verifier receiver implementation is of type [class org.springframework.cloud.contract.verifier.messaging.noop.NoOpStubMessages]
2024-05-13T23:08:50.467+07:00  INFO 47992 --- [api-provider] [           main] c.e.apiprovider.ContractVerifierTest     : Started ContractVerifierTest in 0.659 seconds (process running for 1.336)
2024-05-13T23:08:50.991+07:00  INFO 47992 --- [api-provider] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2024-05-13T23:08:50.991+07:00  INFO 47992 --- [api-provider] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2024-05-13T23:08:50.992+07:00  INFO 47992 --- [api-provider] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 1 ms
2024-05-13T23:08:51.152+07:00  INFO 47992 --- [api-provider] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2024-05-13T23:08:51.152+07:00  INFO 47992 --- [api-provider] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2024-05-13T23:08:51.152+07:00  INFO 47992 --- [api-provider] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 0 ms
2024-05-13T23:08:51.156+07:00  INFO 47992 --- [api-provider] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2024-05-13T23:08:51.156+07:00  INFO 47992 --- [api-provider] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2024-05-13T23:08:51.156+07:00  INFO 47992 --- [api-provider] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 0 ms
2024-05-13T23:08:51.160+07:00  INFO 47992 --- [api-provider] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2024-05-13T23:08:51.160+07:00  INFO 47992 --- [api-provider] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2024-05-13T23:08:51.160+07:00  INFO 47992 --- [api-provider] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 0 ms
2024-05-13T23:08:51.164+07:00  INFO 47992 --- [api-provider] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2024-05-13T23:08:51.164+07:00  INFO 47992 --- [api-provider] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2024-05-13T23:08:51.164+07:00  INFO 47992 --- [api-provider] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 0 ms
2024-05-13T23:08:51.166+07:00  WARN 47992 --- [api-provider] [           main] .w.s.m.s.DefaultHandlerExceptionResolver : Resolved [org.springframework.http.converter.HttpMessageNotReadableException: Required request body is missing: public org.springframework.http.ResponseEntity<com.example.apiprovider.Contact> com.example.apiprovider.ContactController.addContact(com.example.apiprovider.Contact)]
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.588 s -- in com.example.apiprovider.ContractVerifierTest
[INFO] Running com.example.apiprovider.ApiProviderApplicationTests
2024-05-13T23:08:51.172+07:00  INFO 47992 --- [api-provider] [           main] t.c.s.AnnotationConfigContextLoaderUtils : Could not detect default configuration classes for test class [com.example.apiprovider.ApiProviderApplicationTests]: ApiProviderApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
2024-05-13T23:08:51.173+07:00  INFO 47992 --- [api-provider] [           main] .b.t.c.SpringBootTestContextBootstrapper : Found @SpringBootConfiguration com.example.apiprovider.ApiProviderApplication for test class com.example.apiprovider.ApiProviderApplicationTests

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.5)

2024-05-13T23:08:51.197+07:00  INFO 47992 --- [api-provider] [           main] c.e.a.ApiProviderApplicationTests        : Starting ApiProviderApplicationTests using Java 17.0.7 with PID 47992 (started by wongderrick in /Users/wongderrick/workspaces/ioh-tap/api-provider)
2024-05-13T23:08:51.197+07:00  INFO 47992 --- [api-provider] [           main] c.e.a.ApiProviderApplicationTests        : No active profile set, falling back to 1 default profile: "default"
2024-05-13T23:08:51.308+07:00  INFO 47992 --- [api-provider] [           main] c.e.a.ApiProviderApplicationTests        : Started ApiProviderApplicationTests in 0.133 seconds (process running for 2.177)
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.139 s -- in com.example.apiprovider.ApiProviderApplicationTests
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- spring-cloud-contract:4.1.2:generateStubs (default-generateStubs) @ api-provider ---
[INFO] Files matching this pattern will be excluded from stubs generation []
[INFO] Building jar: /Users/wongderrick/workspaces/ioh-tap/api-provider/target/api-provider-0.0.1-SNAPSHOT-stubs.jar
[INFO]
[INFO] --- jar:3.3.0:jar (default-jar) @ api-provider ---
[INFO] Building jar: /Users/wongderrick/workspaces/ioh-tap/api-provider/target/api-provider-0.0.1-SNAPSHOT.jar
[INFO]
[INFO] --- spring-boot:3.2.5:repackage (repackage) @ api-provider ---
[INFO] Replacing main artifact /Users/wongderrick/workspaces/ioh-tap/api-provider/target/api-provider-0.0.1-SNAPSHOT.jar with repackaged archive, adding nested dependencies in BOOT-INF/.
[INFO] The original artifact has been renamed to /Users/wongderrick/workspaces/ioh-tap/api-provider/target/api-provider-0.0.1-SNAPSHOT.jar.original
[INFO]
[INFO] --- install:3.1.1:install (default-install) @ api-provider ---
[INFO] Installing /Users/wongderrick/workspaces/ioh-tap/api-provider/pom.xml to /Users/wongderrick/.m2/repository/com/example/api-provider/0.0.1-SNAPSHOT/api-provider-0.0.1-SNAPSHOT.pom
[INFO] Installing /Users/wongderrick/workspaces/ioh-tap/api-provider/target/api-provider-0.0.1-SNAPSHOT.jar to /Users/wongderrick/.m2/repository/com/example/api-provider/0.0.1-SNAPSHOT/api-provider-0.0.1-SNAPSHOT.jar
[INFO] Installing /Users/wongderrick/workspaces/ioh-tap/api-provider/target/api-provider-0.0.1-SNAPSHOT-stubs.jar to /Users/wongderrick/.m2/repository/com/example/api-provider/0.0.1-SNAPSHOT/api-provider-0.0.1-SNAPSHOT-stubs.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.332 s
[INFO] Finished at: 2024-05-13T23:08:51+07:00
[INFO] ------------------------------------------------------------------------
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
23:09:31.719 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.example.apiconsumer.HelperTest]: HelperTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
23:09:31.769 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.example.apiconsumer.ApiConsumerApplication for test class com.example.apiconsumer.HelperTest

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.5)

2024-05-13T23:09:31.925+07:00  INFO 48667 --- [api-consumer] [           main] com.example.apiconsumer.HelperTest       : Starting HelperTest using Java 17.0.7 with PID 48667 (started by wongderrick in /Users/wongderrick/workspaces/ioh-tap/api-consumer)
2024-05-13T23:09:31.926+07:00  INFO 48667 --- [api-consumer] [           main] com.example.apiconsumer.HelperTest       : No active profile set, falling back to 1 default profile: "default"
2024-05-13T23:09:32.208+07:00  WARN 48667 --- [api-consumer] [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.contract.stubrunner.spring.StubRunnerConfiguration' of type [org.springframework.cloud.contract.stubrunner.spring.StubRunnerConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). The currently created BeanPostProcessor [batchStubRunnerBeanPostProcessor] is declared through a non-static factory method on that class; consider declaring it as static instead.
2024-05-13T23:09:32.216+07:00  WARN 48667 --- [api-consumer] [           main] trationDelegate$BeanPostProcessorChecker : Bean 'stubrunner-org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties' of type [org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [batchStubRunnerBeanPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
2024-05-13T23:09:32.218+07:00  INFO 48667 --- [api-consumer] [           main] o.s.c.c.s.AetherStubDownloaderBuilder    : Will download stubs and contracts via Aether
2024-05-13T23:09:32.228+07:00  INFO 48667 --- [api-consumer] [           main] o.s.c.c.stubrunner.AetherStubDownloader  : Remote repos not passed but the switch to work offline was set. Stubs will be used from your local Maven repository.
2024-05-13T23:09:32.270+07:00  INFO 48667 --- [api-consumer] [           main] o.s.c.c.stubrunner.AetherStubDownloader  : Desired version is [+] - will try to resolve the latest version
2024-05-13T23:09:32.277+07:00  INFO 48667 --- [api-consumer] [           main] o.s.c.c.stubrunner.AetherStubDownloader  : Resolved version is [0.0.1-SNAPSHOT]
2024-05-13T23:09:32.281+07:00  INFO 48667 --- [api-consumer] [           main] o.s.c.c.stubrunner.AetherStubDownloader  : Resolved artifact [com.example:api-provider:jar:stubs:0.0.1-SNAPSHOT] to /Users/wongderrick/.m2/repository/com/example/api-provider/0.0.1-SNAPSHOT/api-provider-0.0.1-SNAPSHOT-stubs.jar
2024-05-13T23:09:32.282+07:00  INFO 48667 --- [api-consumer] [           main] o.s.c.c.stubrunner.AetherStubDownloader  : Unpacking stub from JAR [URI: file:/Users/wongderrick/.m2/repository/com/example/api-provider/0.0.1-SNAPSHOT/api-provider-0.0.1-SNAPSHOT-stubs.jar]
2024-05-13T23:09:32.285+07:00  INFO 48667 --- [api-consumer] [           main] o.s.c.c.stubrunner.AetherStubDownloader  : Unpacked file to [/var/folders/k9/25xtbl_n18b7m41km6jc6q6800twvg/T/contracts-1715616572281-0]
2024-05-13T23:09:33.147+07:00  INFO 48667 --- [api-consumer] [tp1836824012-33] WireMock                                 : Admin request received:
127.0.0.1 - POST /mappings

Host: []
Content-Length: [225]
Content-Type: [text/plain; charset=UTF-8]
Connection: [keep-alive]
User-Agent: [Apache-HttpClient/5.1.3 (Java/17.0.7)]
{
  "id" : "3880674e-abe0-46c5-865d-867c596cd5c1",
  "request" : {
    "url" : "/ping",
    "method" : "GET"
  },
  "response" : {
    "status" : 200,
    "body" : "OK"
  },
  "uuid" : "3880674e-abe0-46c5-865d-867c596cd5c1"
}

2024-05-13T23:09:33.157+07:00  INFO 48667 --- [api-consumer] [tp1836824012-26] WireMock                                 : Admin request received:
127.0.0.1 - POST /mappings

Host: []
Content-Length: [227]
Content-Type: [text/plain; charset=UTF-8]
Connection: [keep-alive]
User-Agent: [Apache-HttpClient/5.1.3 (Java/17.0.7)]
{
  "id" : "885c56eb-1e81-4e43-811b-eb222aa160a0",
  "request" : {
    "url" : "/health",
    "method" : "GET"
  },
  "response" : {
    "status" : 200,
    "body" : "OK"
  },
  "uuid" : "885c56eb-1e81-4e43-811b-eb222aa160a0"
}

2024-05-13T23:09:33.162+07:00  INFO 48667 --- [api-consumer] [tp1836824012-32] WireMock                                 : Admin request received:
127.0.0.1 - POST /mappings

Host: []
Content-Length: [381]
Content-Type: [text/plain; charset=UTF-8]
Connection: [keep-alive]
User-Agent: [Apache-HttpClient/5.1.3 (Java/17.0.7)]
{
  "id" : "72a434d2-a3ab-45cd-9d03-6718183bddb7",
  "request" : {
    "url" : "/contacts",
    "method" : "POST",
    "headers" : {
      "Content-Type" : {
        "matches" : "application/json.*"
      }
    }
  },
  "response" : {
    "status" : 400,
    "transformers" : [ "response-template", "spring-cloud-contract" ]
  },
  "uuid" : "72a434d2-a3ab-45cd-9d03-6718183bddb7"
}

2024-05-13T23:09:33.166+07:00  INFO 48667 --- [api-consumer] [tp1836824012-33] WireMock                                 : Admin request received:
127.0.0.1 - POST /mappings

Host: []
Content-Length: [470]
Content-Type: [text/plain; charset=UTF-8]
Connection: [keep-alive]
User-Agent: [Apache-HttpClient/5.1.3 (Java/17.0.7)]
{
  "id" : "fb60d666-5e33-4ef0-86f2-78bf7f638aed",
  "request" : {
    "url" : "/contacts",
    "method" : "POST",
    "headers" : {
      "Content-Type" : {
        "matches" : "application/json.*"
      }
    },
    "bodyPatterns" : [ {
      "matchesJsonPath" : "$[?(@.['id'] =~ /[0-9]+/)]"
    } ]
  },
  "response" : {
    "status" : 400,
    "transformers" : [ "response-template", "spring-cloud-contract" ]
  },
  "uuid" : "fb60d666-5e33-4ef0-86f2-78bf7f638aed"
}

2024-05-13T23:09:33.168+07:00  INFO 48667 --- [api-consumer] [tp1836824012-32] WireMock                                 : Admin request received:
127.0.0.1 - POST /mappings

Host: []
Content-Length: [475]
Content-Type: [text/plain; charset=UTF-8]
Connection: [keep-alive]
User-Agent: [Apache-HttpClient/5.1.3 (Java/17.0.7)]
{
  "id" : "a1d012b3-32c7-4ccd-9f70-76a0699b8271",
  "request" : {
    "url" : "/contacts",
    "method" : "POST",
    "headers" : {
      "Content-Type" : {
        "matches" : "application/json.*"
      }
    },
    "bodyPatterns" : [ {
      "matchesJsonPath" : "$[?(@.['phone'] =~ /[0-9]{8}/)]"
    } ]
  },
  "response" : {
    "status" : 400,
    "transformers" : [ "response-template", "spring-cloud-contract" ]
  },
  "uuid" : "a1d012b3-32c7-4ccd-9f70-76a0699b8271"
}

2024-05-13T23:09:33.171+07:00  INFO 48667 --- [api-consumer] [tp1836824012-33] WireMock                                 : Admin request received:
127.0.0.1 - POST /mappings

Host: []
Content-Length: [722]
Content-Type: [text/plain; charset=UTF-8]
Connection: [keep-alive]
User-Agent: [Apache-HttpClient/5.1.3 (Java/17.0.7)]
{
  "id" : "43933394-1706-4abc-bc32-8b9dbefcb836",
  "request" : {
    "url" : "/contacts",
    "method" : "POST",
    "headers" : {
      "Content-Type" : {
        "matches" : "application/json.*"
      }
    },
    "bodyPatterns" : [ {
      "matchesJsonPath" : "$[?(@.['id'] =~ /[0-9]+/)]"
    }, {
      "matchesJsonPath" : "$[?(@.['phone'] =~ /[0-9]{8}/)]"
    } ]
  },
  "response" : {
    "status" : 200,
    "body" : "{\"id\":\"{{{jsonPath request.body '$.id'}}}\",\"phone\":\"{{{jsonPath request.body '$.phone'}}}\"}",
    "headers" : {
      "Content-Type" : "application/json"
    },
    "transformers" : [ "response-template", "spring-cloud-contract" ]
  },
  "uuid" : "43933394-1706-4abc-bc32-8b9dbefcb836"
}

2024-05-13T23:09:33.175+07:00  INFO 48667 --- [api-consumer] [tp1836824012-32] WireMock                                 : Admin request received:
127.0.0.1 - POST /mappings

Host: []
Content-Length: [548]
Content-Type: [text/plain; charset=UTF-8]
Connection: [keep-alive]
User-Agent: [Apache-HttpClient/5.1.3 (Java/17.0.7)]
{
  "id" : "9a423608-acd1-4981-9939-a4f5a230c3f7",
  "request" : {
    "url" : "/contacts",
    "method" : "POST",
    "headers" : {
      "Content-Type" : {
        "matches" : "application/json.*"
      }
    },
    "bodyPatterns" : [ {
      "matchesJsonPath" : "$[?(@.['id'] =~ /[0-9]+/)]"
    }, {
      "matchesJsonPath" : "$[?(@.['phone'] =~ /^(?![0-9]{8}$).*$/)]"
    } ]
  },
  "response" : {
    "status" : 400,
    "transformers" : [ "response-template", "spring-cloud-contract" ]
  },
  "uuid" : "9a423608-acd1-4981-9939-a4f5a230c3f7"
}

2024-05-13T23:09:33.178+07:00  INFO 48667 --- [api-consumer] [           main] o.s.c.contract.stubrunner.StubServer     : Started stub server for project [com.example:api-provider:0.0.1-SNAPSHOT:stubs] on port 8080 with [5] mappings
2024-05-13T23:09:33.178+07:00  INFO 48667 --- [api-consumer] [           main] o.s.c.c.stubrunner.StubRunnerExecutor    : All stubs are now running RunningStubs [namesAndPorts={com.example:api-provider:0.0.1-SNAPSHOT:stubs=8080}]
2024-05-13T23:09:33.179+07:00  WARN 48667 --- [api-consumer] [           main] trationDelegate$BeanPostProcessorChecker : Bean 'batchStubRunner' of type [org.springframework.cloud.contract.stubrunner.BatchStubRunner] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected into a currently created BeanPostProcessor [batchStubRunnerBeanPostProcessor]? Check the corresponding BeanPostProcessor declaration and its dependencies.
2024-05-13T23:09:33.231+07:00  INFO 48667 --- [api-consumer] [           main] o.s.c.c.v.m.i.ContractVerifierMessaging  : The message verifier sender implementation is of type [class org.springframework.cloud.contract.verifier.messaging.noop.NoOpStubMessages]
2024-05-13T23:09:33.231+07:00  INFO 48667 --- [api-consumer] [           main] o.s.c.c.v.m.i.ContractVerifierMessaging  : The message verifier receiver implementation is of type [class org.springframework.cloud.contract.verifier.messaging.noop.NoOpStubMessages]
2024-05-13T23:09:33.242+07:00  INFO 48667 --- [api-consumer] [           main] com.example.apiconsumer.HelperTest       : Started HelperTest in 1.42 seconds (process running for 1.888)
2024-05-13T23:09:33.244+07:00  INFO 48667 --- [api-consumer] [           main] c.e.apiconsumer.ApiConsumerApplication   : start
2024-05-13T23:09:33.244+07:00  INFO 48667 --- [api-consumer] [           main] c.e.apiconsumer.ApiConsumerApplication   : end
2024-05-13T23:09:33.730+07:00  INFO 48667 --- [api-consumer] [tp1836824012-31] WireMock                                 : Request received:
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
Matched-Stub-Id: [9a423608-acd1-4981-9939-a4f5a230c3f7]

2024-05-13T23:09:33.745+07:00  INFO 48667 --- [api-consumer] [tp1836824012-32] WireMock                                 : Request received:
127.0.0.1 - POST /contacts

Connection: [Upgrade, HTTP2-Settings]
Content-Length: [30]
Host: [localhost:8080]
HTTP2-Settings: [AAEAAEAAAAIAAAABAAMAAABkAAQBAAAAAAUAAEAA]
Upgrade: [h2c]
User-Agent: [Java-http-client/17.0.7]
Content-Type: [application/json]
{"phone":"123456789","id":"1"}


Matched response definition:
{
  "status" : 400,
  "transformers" : [ "response-template", "spring-cloud-contract" ]
}

Response:
HTTP/1.1 400
Matched-Stub-Id: [9a423608-acd1-4981-9939-a4f5a230c3f7]

2024-05-13T23:09:33.750+07:00  INFO 48667 --- [api-consumer] [tp1836824012-33] WireMock                                 : Request received:
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
Matched-Stub-Id: [9a423608-acd1-4981-9939-a4f5a230c3f7]

2024-05-13T23:09:33.755+07:00  INFO 48667 --- [api-consumer] [tp1836824012-31] WireMock                                 : Request received:
127.0.0.1 - POST /contacts

Connection: [Upgrade, HTTP2-Settings]
Content-Length: [2]
Host: [localhost:8080]
HTTP2-Settings: [AAEAAEAAAAIAAAABAAMAAABkAAQBAAAAAAUAAEAA]
Upgrade: [h2c]
User-Agent: [Java-http-client/17.0.7]
Content-Type: [application/json]
{}


Matched response definition:
{
  "status" : 400,
  "transformers" : [ "response-template", "spring-cloud-contract" ]
}

Response:
HTTP/1.1 400
Matched-Stub-Id: [72a434d2-a3ab-45cd-9d03-6718183bddb7]

2024-05-13T23:09:33.759+07:00  INFO 48667 --- [api-consumer] [tp1836824012-32] WireMock                                 : Request received:
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
Matched-Stub-Id: [a1d012b3-32c7-4ccd-9f70-76a0699b8271]

2024-05-13T23:09:33.802+07:00  INFO 48667 --- [api-consumer] [tp1836824012-33] WireMock                                 : Request received:
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
Matched-Stub-Id: [43933394-1706-4abc-bc32-8b9dbefcb836]

2024-05-13T23:09:33.805+07:00  WARN 48667 --- [api-consumer] [           main] .StubRunnerWireMockTestExecutionListener : You've used fixed ports for WireMock setup - will mark context as dirty. Please use random ports, as much as possible. Your tests will be faster and more reliable and this warning will go away
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.175 s -- in com.example.apiconsumer.HelperTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.771 s
[INFO] Finished at: 2024-05-13T23:09:34+07:00
[INFO] ------------------------------------------------------------------------
```