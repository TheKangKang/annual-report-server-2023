package org.zuel.innovation.bill.Session;

import cn.fabrice.jfinal.service.BaseService;
import org.zuel.innovation.common.module.Teacher;

/**
 * @author lxree
 */
public class TeacherService extends BaseService<Teacher> {
    public TeacherService(){
        super("teacher.",Teacher.class,"teacher");
    }
}