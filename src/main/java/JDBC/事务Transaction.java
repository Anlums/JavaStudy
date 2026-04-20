package JDBC;

import java.sql.Connection;

public class 事务Transaction {
    //事务 (Transaction)：保证数据的“绝对安全”
    //事务是数据库操作的原子单位。经典的“转账”场景：A 减钱和 B 加钱必须同时成功，或者同时失败。
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn.setAutoCommit(false); // 1. 开启事务，关闭自动提交
            // 执行多条 SQL...
            conn.commit(); // 2. 成功则提交
        } catch (Exception e) {
            try {
                if (conn != null) {
                    conn.rollback(); // 3. 失败则回滚，恢复原状
                }
            } catch (Exception rollbackEx) {
                rollbackEx.printStackTrace();
            }
            e.printStackTrace();}

    }
}
