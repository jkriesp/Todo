package net.jenske.todo.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


import java.util.Date;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 1, max = 100) // Adjust size constraints as needed
    @Pattern(regexp = "^[a-zA-Z0-9\\s.,]+$", message = "Title must be alphanumeric and can include spaces, dots, and commas")
    private String title;
    @Pattern(regexp = "^[a-zA-Z0-9\\s.,]+$", message = "Description must be alphanumeric and can include spaces, dots, and commas")
    @Size(max = 500) // Adjust size constraints as needed
    private String description;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dueDate;
    private boolean complete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
