package top.byteinfo.blog.dao.druid3;

import org.apache.ibatis.annotations.Param;
import top.byteinfo.blog.model.x.dto.ArticleHomeDTO;
import top.byteinfo.blog.model.x.dto.ArticlePreviewDTO;
import top.byteinfo.blog.model.x.vo.ConditionVO;

import java.util.List;

public interface TBArticleDao {
   List<ArticleHomeDTO> listArticles(@Param("current") Integer current, @Param("size") Integer size);

   List<ArticlePreviewDTO> listArticlesByCondition(@Param("current") Long current, @Param("size") Long size, @Param("condition") ConditionVO condition);
}
