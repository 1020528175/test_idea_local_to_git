package cn.master.git;


public class Dept {

  private long deptno;
  private String dname;
  private String dbSource;


  public long getDeptno() {
    return deptno;
  }

  public void setDeptno(long deptno) {
    synchronized (this){

    }
    this.deptno = deptno;
  }


  public String getDname() {
    return dname;
  }

  public void setDname(String dname) {
    this.dname = dname;
  }


  public String getDbSource() {
    return dbSource;
  }

  public void setDbSource(String dbSource) {
    this.dbSource = dbSource;
  }

}
