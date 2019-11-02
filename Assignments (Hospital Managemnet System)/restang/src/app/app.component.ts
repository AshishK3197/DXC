import { Component } from '@angular/core';
import { HospitalService } from './hospital.service';
import { Hospital } from './hospital.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'restang';

  constructor(private hospSrv: HospitalService) {}

  hospital: Hospital = {"hospitalId": 0, "hospitalName": "", "hospitalDept": "","hospitalLocation": ""}

  saveHospital()
  {
    this.hospSrv.saveHospital(this.hospital).subscribe(
      data => console.log(data),
      error => console.log(error)
    );
  }

  updateHospital()
  {

   // let resturant:Resturant={"resturantId":1,"resturantName":"VAMPIRE","location":"MUM","rating":1};
    this.hospSrv.updateHospital(this.hospital).subscribe(
      data => console.log(data),
      error => console.log(error)
    );
  }

  deleteResturant()
  {

    //this.resturant.resturantId=1;
    this.hospSrv.deleteHospital(this.hospital.hospitalId).subscribe(
      data => console.log(data),
      error => console.log(error)
    );
  }

  getHosp()
  {

   // this.resturant.resturantId=2;
    this.hospSrv.getHosp(this.hospital.hospitalId).subscribe(
      data => this.hospital = data,
      error => console.log(error)
    );

    console.log(this.hospital.hospitalName);
  }

  hospitals: Hospital[] = [];
  getHospitals()
  {

      this.hospSrv.getAllHospitals().subscribe(
      data => this.hospitals = data,
      error => console.log(error)
    );

    for(let hosp of this.hospitals)
    {
      console.log(hosp.hospitalName);
    }

  }
}
