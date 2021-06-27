import java.util.ArrayList;

/**
 * 新生代回收 MINOR GC回收新生代空间
 * 配置：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 * 含义：堆大小20M，其中10M给新生代，10M给老年代
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * 注意事项：
 * jdk1.7 默认垃圾收集器Parallel Scavenge（新生代）+Parallel Old（老年代）
 * jdk1.8 默认垃圾收集器Parallel Scavenge（新生代）+Parallel Old（老年代）
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.zxd.interview.minorGc
 * @Description :
 * @Create on : 2021/6/3 13:03
 **/
public class MinorGcTest {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        testAllocation();
    }

    public static void testAllocation() {
//        byte[] allocation1, allocation2, allocation3, allocation4, allocation5;
//        allocation1 = new byte[_1MB * 2];
//        allocation2 = new byte[_1MB * 2];
//        allocation3 = new byte[_1MB * 2];
//        allocation4 = new byte[_1MB * 4];

    }/*JDK 1.7.0_51 运行结果：
        下面为 parallel old + parallel 收集器收集方案:
    Heap
     PSYoungGen      total 9216K, used 7669K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
      eden space 8192K, 93% used [0x00000000ff600000,0x00000000ffd7d448,0x00000000ffe00000)
      from space 1024K, 0% used [0x00000000fff00000,0x00000000fff00000,0x0000000100000000)
      to   space 1024K, 0% used [0x00000000ffe00000,0x00000000ffe00000,0x00000000fff00000)
     ParOldGen       total 10240K, used 4096K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
      object space 10240K, 40% used [0x00000000fec00000,0x00000000ff000010,0x00000000ff600000)
     PSPermGen       total 21504K, used 3019K [0x00000000f9a00000, 0x00000000faf00000, 0x00000000fec00000)
      object space 21504K, 14% used [0x00000000f9a00000,0x00000000f9cf2c78,0x00000000faf00000)


        下面为 serrial old + serrial 的组合
    含义：分配担保失败。

    [GC[DefNew: 7505K->533K(9216K), 0.0066009 secs] 7505K->6677K(19456K), 0.0066489 secs] [Times: user=0.03 sys=0.02, real=0.01 secs]
    Heap
     def new generation   total 9216K, used 5123K [0x00000000f9a00000, 0x00000000fa400000, 0x00000000fa400000)
      eden space 8192K,  56% used [0x00000000f9a00000, 0x00000000f9e7b6a0, 0x00000000fa200000)
      from space 1024K,  52% used [0x00000000fa300000, 0x00000000fa385660, 0x00000000fa400000)
      to   space 1024K,   0% used [0x00000000fa200000, 0x00000000fa200000, 0x00000000fa300000)
     tenured generation   total 10240K, used 6144K [0x00000000fa400000, 0x00000000fae00000, 0x00000000fae00000)
       the space 10240K,  60% used [0x00000000fa400000, 0x00000000faa00030, 0x00000000faa00200, 0x00000000fae00000)
     compacting perm gen  total 21248K, used 2923K [0x00000000fae00000, 0x00000000fc2c0000, 0x0000000100000000)
       the space 21248K,  13% used [0x00000000fae00000, 0x00000000fb0dada0, 0x00000000fb0dae00, 0x00000000fc2c0000)
    No shared spaces configured.
    */


}
