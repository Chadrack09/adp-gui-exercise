package za.ac.cput.model;

/**
 *
 * @author    Chadrack B. Boudzoumou
 * @email     219383847@mycput.ac.za
 * @student   219383847
 * @uni       Cape Peninsula University Of Technology
 * @since     Aug 29, 2021 | 11:09:26 PM
 *
 */
public class TModel {
  private int id;
  private String dataType;
  private String size;
  private String primaryKey;
  private String nulls;

  public TModel() {
  }

  public TModel(int id, String dataType, String size, String primaryKey, String nulls) {
    this.id = id;
    this.dataType = dataType;
    this.size = size;
    this.primaryKey = primaryKey;
    this.nulls = nulls;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getPrimaryKey() {
    return primaryKey;
  }

  public void setPrimaryKey(String primaryKey) {
    this.primaryKey = primaryKey;
  }

  public String getNulls() {
    return nulls;
  }

  public void setNulls(String nulls) {
    this.nulls = nulls;
  }

  @Override
  public String toString() {
    return "TModel{" + "id=" + id + ", dataType=" + dataType + ", size=" + size + 
            ", primaryKey=" + primaryKey + ", nulls=" + nulls + '}';
  }
}
