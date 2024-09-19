package com.example.T.domain.Service;

import com.example.T.persistance.Entity.Device;

import java.util.List;

public interface DeviceService {
    Device createDevice(Device device);
    Device getDeviceById(Long id);
    List<Device> getAllDevices();
    Device updateDevice(Device device);
    void deleteDevice(Long id);
}