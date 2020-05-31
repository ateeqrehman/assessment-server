git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/ateeqrehman/assessment-server.git
git push -u origin master

This is a simple Spring boot application that has  Rest API calls to generate the phone number combinations for a given valid 7 or 10 digit phone number.

Following is the Unit test case evidence:

FlashMap:
       Attributes = null

MockHttpServletResponse:
           Status = 200
    Error message = null
          Headers = [Vary:"Origin", "Access-Control-Request-Method", "Access-Control-Request-Headers", Content-Type:"application/json"]
     Content type = application/json
             Body = ["22","2A","2B","2C","A2","AA","AB","AC","B2","BA","BB","BC","C2","CA","CB","CC"]
    Forwarded URL = null
   Redirected URL = null
          Cookies = []
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.614 s - in com.example.demo.DemoApplicationTests
2020-05-31 01:38:09.268  INFO 29724 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  8.877 s
[INFO] Finished at: 2020-05-31T01:38:09-04:00
[INFO] ------------------------------------------------------------------------
