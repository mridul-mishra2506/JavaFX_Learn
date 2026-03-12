package com.first.topics.ButtonControl;


// Anonymous Inner Class

interface Mobile {
    void show(int i);
}

// class MyMobile implements Mobile {
//     @Override
//     public void show(){
//         System.out.println("Hello World");
//     }
// }
public class ButtonControl2 {

    public static void main(String[] args) {
        // Mobile mobile = new Mobile(){
        //     @Override
        //     public void show(){
        //         System.out.println("Hello Mridul");
        //     }
        // };

        Mobile mobile = (i) -> {
            System.out.println("Hello Mridul " + i);
        };

        mobile.show(10);
    }
;

}
