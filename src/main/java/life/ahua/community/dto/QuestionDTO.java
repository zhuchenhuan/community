package life.ahua.community.dto;

import life.ahua.community.model.User;
import lombok.Data;

@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer readCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
