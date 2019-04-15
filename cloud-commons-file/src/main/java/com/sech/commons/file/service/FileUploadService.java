package com.sech.commons.file.service;

import com.sech.commons.core.beans.FileModel;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 文件上传服务
 *
 * @author sech.io
 */
public interface FileUploadService {

    /**
     * 文件上传
     *
     * @param pathCode 文件路径pathCode
     * @param pathType 文件类别pathType
     * @param file     文件
     * @return FileModel 返回文件Model
     * @throws IOException 数据流异常
     */
    FileModel upload(String pathCode, String pathType, MultipartFile file) throws IOException;

    /**
     * 获取文件信息
     *
     * @return attId 返回文件attId
     * @throws IOException 数据流异常
     */
    FileModel getFileModel(String attId) throws IOException;

    /**
     * 删除文件
     *
     * @return attId 返回文件attId
     * @throws IOException 数据流异常
     */
    void delFile(String attId) throws IOException;

    /**
     * 下载文件
     *
     * @param attId    文件attId
     * @param response 下载相应
     * @throws IOException
     */
    void download(String attId, HttpServletResponse response) throws IOException;
}
