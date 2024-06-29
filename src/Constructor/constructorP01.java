package Constructor;

public class constructorP01 {
    public  constructorP01(){
        System.out.println("This is a constructor");
        System.out.println("This is a constructor lecture 1");
        // will not return value
        // name of constructor should be the class name

    }
    public void getData(){
        System.out.println("This is a method");
    }


    public static void main(String[] args) {

        constructorP01 ob = new constructorP01();
        ob.getData();
// compile will call implicit constructor if you have not defined constructor block
// When ever you create an object constructor is called
// block of code when ever an object is crated
    }

}











/*
package Constructor;

// এখানে আমরা Constructor নামের একটি প্যাকেজ তৈরি করেছি
public class constructorP01 {
    // এটা হল ক্লাসের নাম (constructorP01)

    // এটা হল Constructor
    public constructorP01(){
        // যখনই আমরা নতুন constructorP01 অবজেক্ট তৈরি করবো, এই মেসেজগুলো প্রিন্ট হবে
        System.out.println("This is a constructor");
        // এখানে মেসেজ প্রিন্ট হবে
        System.out.println("This is a constructor lecture 1");
        // এখানে মেসেজ প্রিন্ট হবে
    }

    // এটা হল একটি সাধারণ মেথড (ফাংশন) যা অবজেক্টের তথ্য দেখাবে
    public void getData(){
        // যখন এই মেথড কল হবে, এই মেসেজ প্রিন্ট হবে
        System.out.println("This is a method");
        // এখানে মেসেজ প্রিন্ট হবে
    }

    // প্রোগ্রামের মেইন মেথড, যা প্রোগ্রাম চালানোর জন্য দরকার
    public static void main(String[] args) {
        // এখানে আমরা constructorP01 ক্লাসের একটি নতুন অবজেক্ট তৈরি করেছি
        constructorP01 ob = new constructorP01();
        // উপরের লাইনটি Constructor কল করে এবং মেসেজ প্রিন্ট করবে

        // এখানে আমরা getData মেথড কল করছি
        ob.getData();
        // উপরের লাইনটি getData মেথড কল করে এবং মেসেজ প্রিন্ট করবে
    }
}

package Constructor;

আমরা একটি প্যাকেজ তৈরি করেছি যার নাম Constructor। প্যাকেজ হল কোডের একটি গ্রুপিং যা কোডকে সঠিকভাবে সাজিয়ে রাখে।
public class constructorP01 {

এখানে আমরা একটি ক্লাস তৈরি করেছি যার নাম constructorP01। ক্লাস হল অবজেক্টের নীল নকশা।
public constructorP01() {

এটি হল Constructor। এটি ক্লাসের সাথে একই নামের এবং যখন নতুন অবজেক্ট তৈরি হয় তখন কল হয়।
System.out.println("This is a constructor");

এই লাইনে, Constructor কল হলে এটি "This is a constructor" মেসেজটি প্রিন্ট করবে।
System.out.println("This is a constructor lecture 1");

এই লাইনে, Constructor কল হলে এটি "This is a constructor lecture 1" মেসেজটি প্রিন্ট করবে।
public void getData() {

এটি হল একটি মেথড যার নাম getData। মেথড হল ফাংশন যা ক্লাসের মধ্যে থাকে এবং কাজ সম্পাদন করে।
System.out.println("This is a method");

এই লাইনে, getData মেথড কল হলে এটি "This is a method" মেসেজটি প্রিন্ট করবে।
public static void main(String[] args) {

এটি হল মেইন মেথড। প্রোগ্রাম চালানোর জন্য এটি দরকার হয়। প্রোগ্রাম এখান থেকে শুরু হয়।
constructorP01 ob = new constructorP01();

এই লাইনে, আমরা constructorP01 ক্লাসের একটি নতুন অবজেক্ট তৈরি করেছি যার নাম ob। এটি Constructor কল করে।
ob.getData();

এই লাইনে, আমরা getData মেথড কল করেছি যা "This is a method" মেসেজটি প্রিন্ট করবে।
সংক্ষেপে
এই প্রোগ্রামটি একটি Constructor এবং একটি মেথডের উদাহরণ। যখন নতুন অবজেক্ট তৈরি হয়, Constructor কল হয় এবং
দুটি মেসেজ প্রিন্ট করে। এরপর আমরা getData মেথড কল করেছি যা আরেকটি মেসেজ প্রিন্ট করে।



 */
