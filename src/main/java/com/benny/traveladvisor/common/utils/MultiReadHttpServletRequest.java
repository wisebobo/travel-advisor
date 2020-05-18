package com.benny.traveladvisor.common.utils;

import org.apache.commons.io.IOUtils;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.*;

/**
 * Description: This is the class to cache the servlet InputStream, due to InputStream can only be get once in HttpServletRequest
 * @author benny.li
 * Date: 2020/5/18
 */
public class MultiReadHttpServletRequest extends HttpServletRequestWrapper {

    private final ByteArrayOutputStream cachedBytes;

    public MultiReadHttpServletRequest(HttpServletRequest request) {
        super(request);
        cachedBytes = new ByteArrayOutputStream();
        ServletInputStream inputStream = null;
        try {
            inputStream = super.getInputStream();
            IOUtils.copy(inputStream, cachedBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {

        final ByteArrayInputStream cachedInput = new ByteArrayInputStream(cachedBytes.toByteArray());

        return new ServletInputStream() {
            @Override
            public boolean isFinished() {
                return false;
            }

            @Override
            public boolean isReady() {
                return false;
            }

            @Override
            public void setReadListener(ReadListener readListener) {

            }

            @Override
            public int read() throws IOException {
                return cachedInput.read();
            }
        };
    }

    @Override
    public BufferedReader getReader() throws IOException {
        return new BufferedReader(new InputStreamReader(getInputStream()));
    }

}
