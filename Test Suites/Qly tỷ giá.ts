<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Qly tỷ giá</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>ea0f4724-4988-42ac-9715-a17d425070e7</testSuiteGuid>
   <testCaseLink>
      <guid>59612c55-1b79-400f-898c-0f104a0a31c6</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/Login CMS</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>2ce2f8de-f1d6-48c7-9b1d-bb781e44b1f3</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/QlyTyGia/1.Kiểm tra chức năng tìm kiếm tại màn hình Qly tỷ giá</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>b7a85df5-262c-4fe1-9797-4cdacecb3e29</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/QlyTyGia/2.Kiểm tra click button reset</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>c975b2a7-d7ca-469d-9fc8-e1539f2f71de</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/QlyTyGia/3. Verify cấu hình tỷ giá không hợp lệ</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>1c5f2bb6-14e3-4483-990e-fafe00b9a113</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/CMS_FileCauhinhtygia</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>1c5f2bb6-14e3-4483-990e-fafe00b9a113</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>USDsangVND</value>
         <variableId>b2193dbf-bd9b-4930-8a28-b2fc2389f99d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1c5f2bb6-14e3-4483-990e-fafe00b9a113</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>VNDsangUSD</value>
         <variableId>b5d8e20f-749a-4650-b561-295d4124712e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1c5f2bb6-14e3-4483-990e-fafe00b9a113</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ValidateRessult</value>
         <variableId>6cbb5ce8-81a2-4e02-a1f6-c47dad65bf70</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>7758b25e-97b6-4cc1-96f6-f04d61cd0a71</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/QlyTyGia/4.Cấu hình tỷ giá thành công</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>06256fc7-037e-469e-8d06-7439b132a127</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/QlyTyGia/5.Kiểm tra click button huỷ tại popup cấu hình tỷ giá</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>ed727a23-2cb5-4f94-9bad-657a47cd36e0</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/QlyTyGia/6.Verify thêm tỷ giá không thành công</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>afebe01f-6f6e-4ac5-b210-f2dae99fe79d</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/CMS_FileThemmoitygia</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>afebe01f-6f6e-4ac5-b210-f2dae99fe79d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>tygiamua</value>
         <variableId>a89b42e4-4c25-4e85-abfb-5c4e795e7609</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>afebe01f-6f6e-4ac5-b210-f2dae99fe79d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>tygiaban</value>
         <variableId>2e91a129-7002-4cc9-8e6c-8ba538371f75</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>afebe01f-6f6e-4ac5-b210-f2dae99fe79d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ValidateRessult</value>
         <variableId>79b9025c-f3d9-4b9f-986c-492203fee518</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>2af23298-ac07-4195-87db-fe6c8577cc9c</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/QlyTyGia/7.Kiểm tra thêm tỷ giá thành công</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>67d04d62-73df-4766-b7a7-74f682bcc4c4</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/QlyTyGia/8.Kiểm tra click button Huỷ tại màn thêm tỷ giá</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>967b2bcb-8ff6-41ca-81de-43479a698bba</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/QlyTyGia/9.Kiểm tra xoá tỷ giá thành công</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>8d1dec3f-e796-4c8f-9a35-039a9d41d73a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/QlyTyGia/10. Kiểm tra sửa tỷ giá thành công</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>836fcf1d-2836-45ff-a63e-091e14bba051</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/QlyTyGia/11. Kiểm tra hiển thị giá trị quy dổi từ VNĐ sang USD tại màn chuyển tiền CMS</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>35f6ff19-f78c-451c-b95e-b6ca83c3983d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/QlyTyGia/12. Kiểm tra hiển thị giá trị quy dổi từ USD sang VNĐ tại màn chuyển tiền CMS</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>1b170806-0cd7-43ff-a092-8d776afc08df</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/QlyTyGia/13. Kiểm tra hiển thị giá trị quy đổi từ VNĐ sang USD tại màn chuyển tiền MCV</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>5206c7a8-0b4e-4ccc-ad8f-e78041414a71</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/Login CMS</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>1d2f5e38-1185-4b02-86c4-d4a5a607779e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/QlyTyGia/14. Kiểm tra hiển thị giá trị quy đổi USD sang VND từ màn hình chuyển tiền MCV</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
