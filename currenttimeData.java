///**
// * 
// */
//package java_demo;
//
//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;
//import java.util.concurrent.TimeUnit;
//
////class TimeDisplayTask implements Callable<String> {
////
////  public String call() throws Exception {
////
////      LocalTime time = LocalTime.now();
////      LocalDate date = LocalDate.now();
////      Thread.sleep(1000);
////      return "Date: " + date + ", Time: " + time;
////  }
////}
//public class currenttimeData {
//	public static void displayTime(String dateTime) {
//      // Display the current time and date
//      System.out.println("Current date and time: " + dateTime);
//  }
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		
//		ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
//        executor.scheduleAtFixedRate(() -> loopFunction(), 0, 3, TimeUnit.SECONDS); // Run the loop function with a initial delay of 0 seconds and then every 3 seconds
//      // Submitting a task to the executor
//      try {
//          String dateTime = executor.submit(new TimeDisplayTask()).get();
//          // Display the current time using a recursive function
//          displayTime(dateTime);
//      } catch (Exception e) {
//          e.printStackTrace();
//      } finally {
//          // Shutdown the executor after all tasks are completed
//          executor.shutdown();
//      }
//  }
//
//	
//}