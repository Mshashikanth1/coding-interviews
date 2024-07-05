public class Moengage {

/*
    We are focusing on an organized car service station. This station maintains constant service duration for every car.
    Suppose we have n number of customers (1 through n), each with an individual car in need of service. Each customer, denoted as i,
    holds a profit, pi, and a distinct servicing deadline, di.

    Your responsibility is to strategically arrange the servicing of cars in a manner that allows for the number of cars to be
    serviced prior to their individual deadlines to maximize profitability


    Input :
    n= 5
    p= [1, 2 , 2,  3, 4]
    d= [2, 4,  3,  4, 5]  //days


            [2,1] , [3,2] , [4,3] ,[4,2], [5,4]  ⇒   1+ 2+3
            0        1       2          3      4
    t=1

    Max profit  →(  take orders as many as possible ) + ( orders which are payinme more ) //



            5
            2 100
            1 19
            2 27
            1 25
            1 15


            5 * 2


    Int maxProfit( int n, int[] p, int[] d){

        Map< Integer, List< Integers >> dayCarProfitMap = new TreeMap<>();  // i need a sorted list keys

        Int maxDay =Integer.MIN_VALUE;

        for( int i =0 ; i<n ;i++){

            carProfitList = dayCarProfitMap.getOrdefault(  d[ i ] , new ArrayList<>()  );
            carProfitList.add( p[ i ] );

            dayCarProfitMap.put(  d[ i ] , carProfitList    );
        }

        for(  int deadline : dayCarProfitMap. getKeys()  ){

            maxDay= Math.max( maxDay, deadLine);
            Collections.sort ( dayCarProfitMap.get( deadline ) , reverse = true);

        }

        Int profit= 0

        for(  int  day =0 ; day < maxDay  ; day ++) {

            carProfitList = dayCarProfitMap.getFirst( );
            Int currProft= carProfitList.remove( 0 );
            Profit +=    currProft;

            dayCarProfitMap.put( day,  carProfitList);
        }

        Return profit


    }
    */

}
