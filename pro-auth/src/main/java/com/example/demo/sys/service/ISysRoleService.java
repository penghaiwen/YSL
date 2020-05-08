package com.example.demo.sys.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dto.PageDTO;
import com.example.demo.sys.dto.RoleSaveDto;
import com.example.demo.sys.entity.SysRole;
import com.example.demo.sys.vo.RolePageVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 老默
 * @since 2020-04-30
 */
public interface ISysRoleService extends IService<SysRole> {

    /**
     *功能描述 获取角色分页管理列表
     * @author 老默
     * @date 2020/5/8
     * @time 17:12
     * @param dto
     * @param roleName
     * @return com.baomidou.mybatisplus.extension.plugins.pagination.Page<com.example.demo.sys.vo.RolePageVo>
     */
    Page<RolePageVo> getRolePageListByRoleName(PageDTO dto,String roleName);

    /**
     *功能描述 保存角色信息
     * @author 老默
     * @date 2020/5/8
     * @time 17:13
     * @param dto
     * @return boolean
     */
    boolean saveRole(RoleSaveDto dto);
}
