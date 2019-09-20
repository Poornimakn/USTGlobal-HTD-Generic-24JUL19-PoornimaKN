import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Revision4Component } from './revision4.component';

describe('Revision4Component', () => {
  let component: Revision4Component;
  let fixture: ComponentFixture<Revision4Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Revision4Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Revision4Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
