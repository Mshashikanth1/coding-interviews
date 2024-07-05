public class Amazon {

    /*
     * There is a town of N people with k sheriffs. Each person trust some people and mistrust others.
     * The town sheriffs would only trust other sheriffs but would be trusted by everyone else.
     *
     * Given the function:
     * trusts(Person source, Person target) which returns a boolean,
     *
     * Find all the town sheriffs.  ( police --> police) , allPeople --> allPolices
     */
/*

   1 .... N-k -.  .. r.. .. N

           n* (n-k) ---> 1 frist sheriff  ,  O (r-k)  -->  n ^2


           1 ,2 , 3

            sheriff -->  3,
            can't ve--> 1


           1,3 --> true
           2,3 --> false,


           1,2


           1->2 - true
           2->3 - false
           2->4

           */

    /* T : O(n*n) S : O(1)*/
    Person findSherif( Person[] people){


        for( int i=0; i<people.length; i++){

            boolean isSherif=true;

            for( int j=0 ; j< people.length; j++){

                if( i !=j && trusts(people[j], people[i] ) ){
                    isSherif=false;
                    break;
                }
            }

            if( isSherif) return people[i];
        }

        return null;


    }
}
