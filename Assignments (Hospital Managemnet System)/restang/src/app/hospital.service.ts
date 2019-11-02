import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Hospital } from './hospital.model';

@Injectable({
  providedIn: 'root'
})
export class HospitalService {

  constructor(private http: HttpClient) { }

  saveHospital(hospital: Hospital) {
    return this.http.post<any>('http://localhost:1023/hospital', hospital);

  }

  updateHospital(hospital: Hospital) {
    return this.http.put<Hospital>('http://localhost:1023/hospital', hospital);

  }

  deleteHospital(hospitalId: number) {
    return this.http.delete(`http://localhost:1023/hospital/${hospitalId}`);

  }

  getHosp(hospitalId: number) {
    return this.http.get<Hospital>(`http://localhost:1023/hospital/${hospitalId}`);

  }

  getAllHospitals() {
    return this.http.get<Hospital[]>('http://localhost:1023/hospital');
  }


















}
