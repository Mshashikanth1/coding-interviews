package multithreading;

public class SharedResource {

    public SharedResource() {
        this.count = 0;
    }


    int count;

    void increment() {
        count++;
    }

    public int getCount(){
        return this.count;
    }
}
