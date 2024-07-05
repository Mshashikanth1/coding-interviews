public class BirlaR2SysDesign {


    /*  [ 15/May/2024 :: vinayak bharadwaj :: vinayak.bhardwaj@adityabirla.com ]


Question 1: DSA  Time : O(n^2)  Space :O(n)
    * Question 1  ---> Array = [4,5,900,11,15]
        Sum = 12
      * 900 % 12
           Sub arrays : {  {4,5,3} , {12} ..., {6,6}, {5,7}, {8}}


Question 2: Design Kafka,RabbitMQ, GCP Pub Sub System :




     *
     *  { topics --> { id, name}  , Subscribers--- { id, name, topiId}  , messages --{ topicId , scid, msg , status (process/not prosed/ purged) ,
     *   rtryCount, endpoint, timeStamp, lastModified } }
     *
     *  select  sub.id from Subscribers  where topic= id , message,;
     *
     * indexing -->  queries [ indexCount, timestamp, status ]
     * binarySearch
     *
     * while(){
     *   // [200, 500 ]
     *    [(select * message where status= notProces & retryCount < threshold && timestamp < msg.timeStamp + 4days; )] --> collections
     *      .stream()
     *      .parallel()
     *      .map( msg -> perform(msg))
     *
     * @Async
     * perform{
     *   if(REST --> HTTP:200;)
     *      status= processed;
     *          else {
     *          retryCount++;
     *     }
     * }
     * }
     *


 Question 3 : some sql questions


     *  transaction
     *          begin:
     *      save point) delete ->   empId=1;
     *      save point) update -->  empId=1
     *      end
     *         commit
     *
     * locking:


 Question 4 : some spring boot questions


     * all : @controller, @RestController, @Get, @post ,@Put @Delete
     * @Repository, @Service,
     * @Configuration, @Component
     * @Bean
     * @SpringApplication--> @Autoconfig( )
     *
     * @CustomAnnotations{}
     *
     * @Transactional()
     *
     * s.a..........h.i.@gmail.com -->   all dots; @Annotations
     *
     *  step-way , rollback , commit,
     *  queue = []
    *
    12.5 , 11
    */
}
