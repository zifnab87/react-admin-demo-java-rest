package aor.demo.crud;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UploadFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String diskPath;
    public String path;

    public UploadFile() {

    }

    @JsonCreator
    public UploadFile(int id) {
        this.id = id;
    }
}
