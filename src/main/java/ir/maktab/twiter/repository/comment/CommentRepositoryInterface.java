package ir.maktab.twiter.repository.comment;

import ir.maktab.twiter.entity.Comment;
import ir.maktab.twiter.entity.Twitter;

import java.sql.SQLException;
import java.util.List;

public interface CommentRepositoryInterface {

    void save(Comment comment) throws SQLException;

    List<Comment> findAll(Twitter twitter) throws SQLException;

    void deleted(int id) throws SQLException;
}
