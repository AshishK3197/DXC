import { Injectable } from '@angular/core';
import { Product } from './product.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http:HttpClient) { }

  saveProduct(product: Product) {
    return this.http.post<any>('http://localhost:1024/product', product);

  }

  updateProduct(product: Product) {
    return this.http.put<Product>('http://localhost:1024/product', product);

  }

  deleteProduct(productId: number) {
    return this.http.delete(`http://localhost:1024/product/${productId}`);

  }

  getProd(ProductId: number) {
    return this.http.get<Product>(`http://localhost:1024/product/${ProductId}`);

  }

  getAllProducts() {
    return this.http.get<Product[]>('http://localhost:1024/product');
  }
}
