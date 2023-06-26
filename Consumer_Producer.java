/**
 * OopsPractic
 */
public class OopsPractic {

    public static void main(String[] args) {
        Company comp = new Company();
        producer p = new producer(comp);
        Consumer C = new Consumer(comp);
        p.start();
        C.start();

    }
}

class Company {
    int a;

    synchronized public void producer_item(int a) {
        System.out.println("Producer produce : " + this.a);
        this.a = a;
    }

    synchronized public int consumer_item() {
        System.out.println("Consumer conusme : " + this.a);
        return this.a;
    }
}

// Producer Method

class producer extends Thread {
    Company c;

    producer(Company c) {
        this.c = c;
    }

    public void run() {
        int i = 1;
        System.out.println("Now its producing");
        while (true) {
            this.c.producer_item(i);
            try {
                Thread.sleep(3000);

            } catch (Exception e) {

            }
            i++;
        }
    }
}

// Consumer method

class Consumer extends Thread {
    Company c;
    Consumer(Company c){
        this.c = c;
    }
    public void run() {
        System.out.println("now its Consuming");
        while (true) {
            this.c.consumer_item();
            try {
                Thread.sleep(3000);
            } catch (Exception e){
            }
        }
    }
}
