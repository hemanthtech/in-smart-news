package smart.in.sources.service.entity;

import java.io.Serializable;
import java.util.ArrayList;

import smart.in.sources.entity.SourceEntity;

/**
 * News Sources API Response , which is de-serialized over GSON
 *
 * @author ranjith
 */
public class NewsSourcesAPIResponse implements Serializable {

  String status;
  ArrayList<SourceEntity> sources = new ArrayList<>();

  public String getStatus() {
    return status;
  }

  public ArrayList<SourceEntity> getSources() {
    return sources;
  }

  @Override
  public String toString() {
    return " Status : "
        + status
        + " Sources : "
        + sources.toString();
  }
}
