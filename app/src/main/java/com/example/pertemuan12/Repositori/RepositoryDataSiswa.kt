package com.example.pertemuan12.Repositori

import com.example.localrestapi.apiservice.ServiceApiSiswa
import com.example.localrestapi.modedata.DataSiswa
import com.example.pertemuan12.apiservice.ServiceApiSiswa
import com.example.pertemuan12.modeldata.DataSiswa

interface RepositoryDataSiswa {
    suspend fun getDataSiswa() : List<DataSiswa>

    suspend fun postDataSiswa(dataSiswa: DataSiswa) :retrofit2.Response<Void>
}

