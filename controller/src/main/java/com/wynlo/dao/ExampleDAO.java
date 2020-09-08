package com.wynlo.dao;

import com.mongodb.client.result.DeleteResult;
import com.wynlo.models.Example;

import java.util.List;

public interface ExampleDAO {

    Example insertExample(Example example);

    List<Example> selectAllExamples();

    Example selectExampleById(String id);

    DeleteResult deleteExampleById(String id);

    Example updateExample(Example example);

}