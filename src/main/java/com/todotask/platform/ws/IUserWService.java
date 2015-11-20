package com.todotask.platform.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.todotask.platform.model.User;

@WebService
public interface IUserWService {
    /**
     * 创建用户
     * @return
     */
    @WebMethod(operationName = "createUser")
    @WebResult(name = "result")
    public boolean createUser(@WebParam(name = "user") User user);

    /**
     * 删除用户
     * @param username
     * @param password
     * @param SystemID
     * @return
     */

    @WebMethod(operationName = "deleteUser")
    @WebResult(name = "result")
    public boolean deleteUser(@WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "SystemID") String SystemID, @WebParam(name = "key") String key, @WebParam(name = "deleteUserID") String deleteUserID);

    /**
     * 修改用户： {方法功能中文描述}
     * @param username
     * @param password
     * @param SystemID
     * @param key
     * @param modifyUserID
     * @return
     */

    @WebMethod(operationName = "modifyUser")
    @WebResult(name = "result")
    public boolean modifyUser(@WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "SystemID") String SystemID, @WebParam(name = "key") String key, @WebParam(name = "deleteUserID") String deleteUserID);

    /**
     * 查询某系统的所有用户： {方法功能中文描述}
     * @param systemID
     * @return
     * @author: zhursh
     */

    @WebMethod(operationName = "findAllUserBySystem")
    @WebResult(name = "result")
    public List<User> findAllUserBySystem(@WebParam(name = "systemID") String systemID);

    /**
     * 根据类型查询用户： {方法功能中文描述}
     * @param typeID
     * @return
     * @author: zhursh
     */

    @WebMethod(operationName = "findAllUserByType")
    @WebResult(name = "result")
    public String[] findAllUserByType(@WebParam(name = "typeID") String typeID);

    /**
     * 用户认证： {方法功能中文描述}
     * @author: zhursh
     */

    @WebMethod(operationName = "predictValidUser")
    @WebResult(name = "result")
    public String predictValidUser(@WebParam(name = "username") String username, @WebParam(name = "password") String password);

    /**
     * 获取用户所对应的权限： {方法功能中文描述}
     * @param userid
     * @return
     * @author: zhursh
     */
    @WebMethod(operationName = "getAllPriByUser")
    @WebResult(name = "result")
    public String[] getAllPriByUser(@WebParam(name = "userid") String userid);
}
