package org.apache.mesos.hdfs.util;

public class HDFSConstants {

  // Total number of NameNodes
  public static final Integer TOTAL_NAME_NODES = 2;

  // Messages
  public static final String NAME_NODE_INIT_MESSAGE = "-i";
  public static final String NAME_NODE_BOOTSTRAP_MESSAGE = "-b";

  // NodeIds
  public static final String NAME_NODE_ID = "namenode";
  public static final String JOURNAL_NODE_ID = "journalnode";
  public static final String DATA_NODE_ID = "datanode";
  public static final String ZKFC_NODE_ID = "zkfc";

  // NameNode TaskId
  public static final String NAME_NODE_TASKID = ".namenode.namenode.";

  // ExecutorsIds
  public static final String NODE_EXECUTOR_ID = "NodeExecutor";
  public static final String NAME_NODE_EXECUTOR_ID = "NameNodeExecutor";

  // Path to Store HDFS Binary
  public static final String HDFS_BINARY_DIR = "hdfs";

}
