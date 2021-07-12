//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.tiny.flink.connector.clickhouse.internal.partitioner;

import org.apache.flink.table.data.RowData;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author tiger
 */
public class ShufflePartitioner implements ClickHousePartitioner {

    private static final long serialVersionUID = 1L;

    public ShufflePartitioner() {
    }

    @Override
    public int select(RowData record, int numShards) {
        return ThreadLocalRandom.current().nextInt(numShards);
    }
}
