package com.example.xiangdabing;

/**
 * @author xiangmin
 * @date 2020/11/16 16:34
 */
public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        /*Thread thread = new Thread(new JoinDemo());
        thread.sleep(2000);
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("主线程第" + i + "次执行！");
            if (i >= 2)
                try {
                    // t1线程合并到主线程中，主线程停止执行过程，转而执行t1线程，直到t1执行完毕后继续。
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }*/
        for(int i=0;i<10;i++){
             while(true){
                System.out.println("111");
                break;
            }
            System.out.println("222");
        }
    }
}

class JoinDemo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程1第" + i + "次执行！");
        }
    }
}
