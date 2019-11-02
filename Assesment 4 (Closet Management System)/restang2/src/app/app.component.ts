import { Component } from '@angular/core';
import { ProductService } from './product.service';
import { Product } from './product.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'restang2';


  constructor(private prodSrv:ProductService){}

  product : Product = {"productId": 0, "productName": "", "productSize": 0,"productColor": "","productPrice": 0}

  saveProduct(){
    this.prodSrv.saveProduct(this.product).subscribe(
      data => console.log(data),
      error => console.log(error));
  }

  updateProduct(){
    this.prodSrv.updateProduct(this.product).subscribe( 
      data => console.log(data),
      error => console.log(error));
  }

  deleteProduct(){
    this.prodSrv.deleteProduct(this.product.productId).subscribe( 
      data => console.log(data),
      error => console.log(error));
  }

  getProd(){
    this.prodSrv.getProd(this.product.productId).subscribe(
      data => console.log(data),
      error => console.log(error)
    );
  }

  products : Product[]=[];
  getProducts(){
    this.prodSrv.getAllProducts().subscribe(
      data => this.products = data,
      error => console.log(error)
    )

    for(let prod of this.products)
    {
      console.log(prod.productName);
    }

  }













}
