package test.jetbrains.emptyboot.test;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Table("test")
public class TestRecord implements Persistable<UUID> {

    @Id
    private UUID id;

    private String content;

    public TestRecord() {
    }

    @PersistenceCreator
    public TestRecord(UUID id, String content) {
        this.id = id;
        this.content = content;
    }

    @Override
    public UUID getId() {
        return null;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean isNew() {
        return getId() == null;
    }

}
