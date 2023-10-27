package session16_funcitonal_infterface_lambda.challenges.functional_interfaces_challenges.find_item_in_list;

import org.apache.poi.ss.formula.functions.T;

import java.util.List;

public interface ListContains <T>{
    boolean isElementInList(List<T>list, T element);
}