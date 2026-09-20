package GarbageCollection;

public class ExampleOfGC {
    public static void main(String[] args) {

        ExampleOfGC exampleOfGC = new ExampleOfGC();
        exampleOfGC = null;
        System.gc(); // Gc is Garbage Collection
    }

    protected void finalize() throws Throwable {
        System.out.println("Finalize Method call..");
    }
}


/*

How GC works internally in JVM?

-> garbage collection works in below phases

1. Stop the world --> Stop all running threads for few milli sec
2. Marking  --> gc will go to jvm heap area, and it will identify un-referenced objects and it will mark them
3. Sweeping  --> Gc Will sweep marked objects
4. Compaction  --> it will adjust all things

After that gc will give signal to jvm to continue the execution.
 */